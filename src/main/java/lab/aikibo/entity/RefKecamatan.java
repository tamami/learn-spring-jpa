package lab.aikibo.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by tamami on 03/04/17.
 */
@Entity
@Table(name = "ref_kecamatan")
@IdClass(RefKecamatan.RefKecamatanPK.class)
@Data
public class RefKecamatan {

    @Id
    private String kdPropinsi;
    @Id
    private String kdDati2;
    @Id
    private String kdKecamatan;
    @Column(name="nm_kecamatan")
    private String nmKecamatan;


    // -- pk

    @Data
    public class RefKecamatanPK implements Serializable {
        private String kdPropinsi;
        private String kdDati2;
        private String kdKecamatan;
    }

}
