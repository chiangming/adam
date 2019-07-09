package com.code.matt.dto;

/**
 * @Author: ming
 * @Date: Created in    19-7-9 下午7:26
 * @Description:
 * @Modified: By
 */
public class GithubUserDTO {
    private String login;
    private Long id;
    private String bio;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
