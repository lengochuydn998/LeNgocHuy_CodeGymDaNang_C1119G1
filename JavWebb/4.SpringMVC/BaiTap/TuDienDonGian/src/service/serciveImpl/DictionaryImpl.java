package service.serciveImpl;

import org.springframework.stereotype.Service;
import service.Dictionary;

import java.util.HashMap;
import java.util.Map;
@Service
public class DictionaryImpl implements Dictionary {
    @Override
    public  String search(String keyWord) {
        Map<String,String> dic = new HashMap<>();
        dic.put("how","the nao");
        dic.put("apple","tao");
        dic.put("play","choi");
        dic.put("hinhin","anh yeu em");
        String result = dic.get(keyWord);
        if(result != null){
            return result;
        }else {
            return "Not Found";
        }
    }
}
