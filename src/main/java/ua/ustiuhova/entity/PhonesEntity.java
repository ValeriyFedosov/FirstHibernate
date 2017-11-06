package ua.ustiuhova.entity;

import javax.persistence.*;

/**
 * Created by admin on 05.11.2017.
 */
@Entity
@Table(name = "phones", schema = "tryhibernate", catalog = "")
public class PhonesEntity {
    private int id;
    private Integer personId;
    private String tphone;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "person_id", nullable = true)
    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    @Basic
    @Column(name = "tphone", nullable = true, length = 10)
    public String getTphone() {
        return tphone;
    }

    public void setTphone(String tphone) {
        this.tphone = tphone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PhonesEntity that = (PhonesEntity) o;

        if (id != that.id) return false;
        if (personId != null ? !personId.equals(that.personId) : that.personId != null) return false;
        if (tphone != null ? !tphone.equals(that.tphone) : that.tphone != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (personId != null ? personId.hashCode() : 0);
        result = 31 * result + (tphone != null ? tphone.hashCode() : 0);
        return result;
    }
}
