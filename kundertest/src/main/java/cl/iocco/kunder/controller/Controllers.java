package cl.iocco.kunder.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controllers {


	@RequestMapping(value = "/time",method = RequestMethod.GET)
	public  ResponseEntity<DataResponse> getTime(@RequestParam("value") String value) {
		if(value.equals("hora")){
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSXXX");
			return new ResponseEntity<DataResponse>(new DataResponse("200", "OK", df.format(new Date())), HttpStatus.OK);



		}
		return new ResponseEntity<DataResponse>(new DataResponse("400", "error", "error"), HttpStatus.BAD_REQUEST);

		
	}
	
	@RequestMapping(value = "/word",method = RequestMethod.POST)
	public ResponseEntity<DataResponse> postWord(@RequestBody WordData wd) {
		if(wd.getData().length()==4){
			return new ResponseEntity<DataResponse>(new DataResponse("200", "OK", wd.getData().toUpperCase()), HttpStatus.OK);
		}
		return new ResponseEntity<DataResponse>(new DataResponse("400", "Tamaño incorrecto", wd.getData()), HttpStatus.BAD_REQUEST);
	}
} 