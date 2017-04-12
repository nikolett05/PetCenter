package hu.unideb.inf.petcenter.db.entity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "petshops")
@NamedQueries({ @NamedQuery(name = "PetShop.findAll", query = "SELECT u FROM PetShop u"), })
public class PetShop {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "petshops_id")
    private Integer id;

    @Column(name = "petshopName")
    private String name;
    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "Petshops_PetData", joinColumns = { @JoinColumn(name ="petshops_id") }, inverseJoinColumns = { @JoinColumn(name = "petdata_id") })
    private Set<PetData> petDataSet = new HashSet<PetData>(0);

    public PetShop() {
    }

    public PetShop(String name, String username, String password) {
        super();
        this.name = name;
        this.username = username;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<PetData> getPetDataSet() {
        return petDataSet;
    }

    public void setPetDataSet(Set<PetData> petDataSet) {
        this.petDataSet = petDataSet;
    }

    @Override
    public String toString() {
        return "PetShop{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
