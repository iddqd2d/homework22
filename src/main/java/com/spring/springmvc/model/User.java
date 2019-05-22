package com.spring.springmvc.model;

import com.spring.springmvc.listeners.ProjectListener;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@Accessors(chain = true)
@Entity
@EntityListeners(value = ProjectListener.class)
@Table(name = "users")
public class User extends MappedEntity {

    @Column
    private String username;

    @Column
    private String password;

    @Column
    private boolean active;
}
