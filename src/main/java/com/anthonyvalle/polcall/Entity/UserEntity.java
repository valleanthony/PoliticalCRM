package com.anthonyvalle.polcall.Entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String publicId;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String password;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Collection<RoleEntity> roles;
    @ManyToOne
    private CampaignEntity campaign;


    public UserEntity() {
    }
}
