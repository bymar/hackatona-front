package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela USUARIA
* @generated
*/
@Entity
@Table(name = "\"USUARIA\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.usuaria")
public class usuaria implements Serializable {

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

    /**
    * @generated
    */
    @Column(name = "phone", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String phone;

    /**
    * @generated
    */
    @Column(name = "email", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String email;

    /**
    * Construtor
    * @generated
    */
    public usuaria(){
    }

    /**
    * Obtém id
    * return id
    * @generated
    */
    
    public java.lang.String getId(){
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public usuaria setId(java.lang.String id){
        this.id = id;
        return this;
    }
    /**
    * Obtém phone
    * return phone
    * @generated
    */
    
    public java.lang.String getPhone(){
        return this.phone;
    }

    /**
    * Define phone
    * @param phone phone
    * @generated
    */
    public usuaria setPhone(java.lang.String phone){
        this.phone = phone;
        return this;
    }
    /**
    * Obtém email
    * return email
    * @generated
    */
    
    public java.lang.String getEmail(){
        return this.email;
    }

    /**
    * Define email
    * @param email email
    * @generated
    */
    public usuaria setEmail(java.lang.String email){
        this.email = email;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
usuaria object = (usuaria)obj;
        if (id != null ? !id.equals(object.id) : object.id != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

}