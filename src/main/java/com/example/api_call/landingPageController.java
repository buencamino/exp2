package com.example.api_call;

import com.dropbox.core.DbxException;
import com.dropbox.core.DbxRequestConfig;
import com.dropbox.core.v2.DbxClientV2;
import com.dropbox.core.v2.files.ListFolderResult;
import com.dropbox.core.v2.files.Metadata;
import com.dropbox.core.v2.users.FullAccount;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class landingPageController {

    @Resource
    private apiService apiservice;

    @Autowired
    public landingPageController(apiService apiservice) {
        this.apiservice = apiservice;
    }

    @GetMapping("/home")
    public String landingPage() throws DbxException {

        /*
        String url = "https://api.ipstack.com/";

        String ip = "134.201.250.155";
        String key = "?access_key=" + apikey;
        StringBuilder builder = new StringBuilder(url);
        builder.append(ip).append(key);

        String result = builder.toString();

        System.out.println(result);
*/

        String url = "http://gateway.marvel.com/v1/public/comics?ts=1&apikey=9b1a02243387efa3b3c1f6915bfe7431&hash=bc4362118002999f31ef3937ac27c6f1";
        String output = apiservice.getIP(url);
        JsonObject jsonObject = JsonParser.parseString(output).getAsJsonObject();
        String x = jsonObject.get("status").getAsString();

        return x;

        /*
        DbxRequestConfig config = DbxRequestConfig.newBuilder("dropbox/gigantes").build();
        DbxClientV2 client = new DbxClientV2(config, ACCESS_TOKEN);
        FullAccount account = client.users().getCurrentAccount();
        String accountName = "";

        accountName = account.getName().getDisplayName();
        */
        /*
        ListFolderResult result = client.files().listFolder("");

        while (true) {
            for (Metadata metadata : result.getEntries()) {
                System.out.println(metadata.getPathLower());
            }

            if (!result.getHasMore()) {
                break;
            }

            result = client.files().listFolderContinue(result.getCursor());
        }
*/}
}
