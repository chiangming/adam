package com.code.matt.provider;

import com.alibaba.fastjson.JSON;
import com.code.matt.dto.AccessTokenDTO;
import com.code.matt.dto.GithubUserDTO;
import okhttp3.*;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * @Author: ming
 * @Date: Created in    19-7-9 下午6:37
 * @Description:
 * @Modified: By
 */
@Component
public class GithubProvider {
    public String getAccessToken(AccessTokenDTO accessTokenDTO){
        MediaType mediaType = MediaType.get("application/json; charset=utf-8");
        OkHttpClient client = new OkHttpClient();
        RequestBody body = RequestBody.create(mediaType, JSON.toJSONString(accessTokenDTO));
        Request request = new Request.Builder()
                .url("https://github.com/login/oauth/access_token")
                .post(body)
                .build();
        try (Response response = client.newCall(request).execute()) {
            String string= response.body().string();
            String[] split = string.split("&");
            String tokenStr = split[0];
            String token= tokenStr.split("=")[1];
            return token;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public GithubUserDTO getUser(String accessToken){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://api.github.com/user?access_token="+accessToken)
                .build();
        try {
            Response response = client.newCall(request).execute();
            String string = response.body().string();
            GithubUserDTO githubUser = JSON.parseObject(string, GithubUserDTO.class);
            return githubUser;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
