package hu.unideb.inf.petcenter.db.entity;

import javax.persistence.*;

@Entity
@Table(name = "petdata")
@NamedQueries({ @NamedQuery(name = "PetData.findAll", query = "SELECT u FROM PetData u"), })
public class PetData {

    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name ="petdata_id")
    private Integer petdata_id;

    @Column(name = "breed")
    private String breed;

    @Column(name = "gender")
    private String gender;

    @Column(name = "available")
    private Integer available;

    @Column(name = "feeding")
    private String feeding;

    @Column(name = "treating")
    private String treating;

    @Column(name = "vaccinated")
    private boolean vaccinated;

    @Column(name = "chip")
    private boolean chip;

    @Column(name = "price")
    private Integer price;

    public PetData() {
    }

    public PetData(String breed, String gender, Integer available, String feeding, String treating, boolean vaccinated, boolean chip, Integer price) {
        this.breed = breed;
        this.gender = gender;
        this.available = available;
        this.feeding = feeding;
        this.treating = treating;
        this.vaccinated = vaccinated;
        this.chip = chip;
        this.price = price;
    }

    public Integer getPetdata_id() {
        return petdata_id;
    }

    public void setPetdata_id(Integer petdata_id) {
        this.petdata_id = petdata_id;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAvailable() {
        return available;
    }

    public void setAvailable(Integer available) {
        this.available = available;
    }

    public String getFeeding() {
        return feeding;
    }

    public void setFeeding(String feeding) {
        this.feeding = feeding;
    }

    public String getTreating() {
        return treating;
    }

    public void setTreating(String treating) {
        this.treating = treating;
    }

    public boolean isVaccinated() {
        return vaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }

    public boolean isChip() {
        return chip;
    }

    public void setChip(boolean chip) {
        this.chip = chip;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
