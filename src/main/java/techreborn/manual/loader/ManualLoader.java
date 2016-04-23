package techreborn.manual.loader;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.compress.archivers.zip.ZipFile;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import techreborn.manual.saveFormat.ManualFormat;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

/**
 * Created by modmuss50 on 23/04/2016.
 */
public class ManualLoader {

    public static final String MANUAL_VERSION = "0";

    File configDir;

    public ManualLoader(File configDir) {
        this.configDir = configDir;
    }

    VersionsInfo info = null;

    public void load() throws IOException {
        File manualdir = new File(configDir, "manual");
        if (!manualdir.exists()) {
            manualdir.mkdir();
        }

        URL url = new URL("http://modmuss50.me/techreborn/manual/versions.json");
        URLConnection con = url.openConnection();
        InputStream in = con.getInputStream();
        String encoding = con.getContentEncoding();
        encoding = encoding == null ? "UTF-8" : encoding;
        String body = IOUtils.toString(in, encoding);
        Gson gson = new Gson();
        info = gson.fromJson(body, new TypeToken<VersionsInfo>() {
        }.getType());

        DownloadablePackageInfo downloadablePackageInfo = null;

        if(info != null){
            for(DownloadablePackageInfo packageInfo : info.versions){
                if(packageInfo.packageInfo.version.equals(MANUAL_VERSION)){
                    downloadablePackageInfo = packageInfo;
                    break;
                }
            }
        }

        if(downloadablePackageInfo != null){
            File zipLocation = new File(manualdir, downloadablePackageInfo.fileName);
            if(zipLocation.exists()){
                String md5 = getMD5(zipLocation);
                if(md5.equals(downloadablePackageInfo.md5)){
                    //Oh look we allready have it!
                }
            } else {
                FileUtils.copyURLToFile(new URL("http://modmuss50.me/techreborn/manual/packages/" + downloadablePackageInfo.fileName), zipLocation);
                String md5 = getMD5(zipLocation);
                if(md5.equals(downloadablePackageInfo.md5)){
                    //ok the downloaded file is valid
                }
            }


            ZipFile file = new ZipFile(zipLocation);
//            file.

        }

    }

    public static String getMD5(File file) throws IOException {
        FileInputStream fis = new FileInputStream(file);
        String md5 = DigestUtils.md5Hex(fis);
        fis.close();
        return md5;
    }


}