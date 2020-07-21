package xyz.lwh.springdata.domain;

import javax.persistence.*;

/**
 * @author lwh
 * @date 2020/7/19
 **/

@Entity
@Table(name="admin_user")
public class AdminUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="admin_id")
    private Integer adminId;

    @Column(name="admin_username")
    private String adminUsername;

    @Column(name="admin_password")
    private String adminPassword;

    public AdminUser() {
    }

    public AdminUser(Integer adminId, String adminUsername, String adminPassword) {
        this.adminId = adminId;
        this.adminUsername = adminUsername;
        this.adminPassword = adminPassword;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAdminUsername() {
        return adminUsername;
    }

    public void setAdminUsername(String adminUsername) {
        this.adminUsername = adminUsername;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }
}
