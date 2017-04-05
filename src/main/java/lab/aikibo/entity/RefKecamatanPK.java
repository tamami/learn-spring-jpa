package lab.aikibo.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by tamami on 05/04/17.
 */
@Data
public class RefKecamatanPK implements Serializable {
    private String kdPropinsi;
    private String kdDati2;
    private String kdKecamatan;

    public RefKecamatanPK() {}

    public RefKecamatanPK(String kdPropinsi, String kdDati2, String kdKecamatan) {
        this.kdPropinsi =  kdPropinsi;
        this.kdDati2 = kdDati2;
        this.kdKecamatan = kdKecamatan;
    }
}
