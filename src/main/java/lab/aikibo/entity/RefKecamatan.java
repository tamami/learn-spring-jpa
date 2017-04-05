package lab.aikibo.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by tamami on 03/04/17.
 */
@Entity
@Table(name = "ref_kecamatan")
@IdClass(RefKecamatanPK.class)
@Data
public class RefKecamatan {

    @Id
    @Column(name="kd_propinsi")
    private String kdPropinsi;

    @Id
    @Column(name = "kd_dati2")
    private String kdDati2;

    @Id
    @Column(name = "kd_kecamatan")
    private String kdKecamatan;

    @Column(name="nm_kecamatan")
    private String nmKecamatan;

}
