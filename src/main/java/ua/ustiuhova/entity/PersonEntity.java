package ua.ustiuhova.entity;

import javax.persistence.*;

/**
 * Created by admin on 05.11.2017.
 */
@Entity
@Table(name = "person")
public class PersonEntity {
    private Integer id;
    private String fio;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "fio", length = 30)
    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PersonEntity that = (PersonEntity) o;

        if (id != that.id) return false;
        if (fio != null ? !fio.equals(that.fio) : that.fio != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (fio != null ? fio.hashCode() : 0);
        return result;
    }
}
