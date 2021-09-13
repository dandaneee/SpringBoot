	package upload;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("Upservice")
public class UploadServiceImpl implements UploadService {
	@Autowired
	UploadDAO dao;
	
	@Override
	public void insertData(UploadVO vo) {
		dao.insertdata(vo);
		
	}

}
