package lab.aikibo.repo;

import lab.aikibo.entity.RefKecamatan;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by tamami on 03/04/17.
 */
public interface RefKecamatanRepo extends CrudRepository<RefKecamatan, RefKecamatan.RefKecamatanPK> {

    List<RefKecamatan> findAll();

}
