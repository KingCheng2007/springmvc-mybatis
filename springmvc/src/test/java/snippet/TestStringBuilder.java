package snippet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestStringBuilder {

	public static void main(String[] args) {
		List<String> s = new ArrayList<String>();
		for(int i=0 ;i<1000;i++){
			s.add(i+"");
		}
		double batch  = 300.00 ;
		double count = Math.ceil(s.size()/batch);
		int batch_Int = 300 ;
		//Integer ii = Integer.parseInt((batch+"").substring(0, (count+"").length()-2));
		System.out.println(batch_Int);
		
		Map<String,List<String>> map = new HashMap<String,List<String>>();
		//0 -- 299 ,300 - - 599, 600 --899, 900 -- 1000
		for(int re = 0 ;re<count;re++){
			List<String> pie =  null ;
			if(re == 0){
				pie = s.subList(re, batch_Int);
			}else if(re == count -1){
				pie = s.subList(re*batch_Int+1, s.size() - (re-1)*batch_Int);
			}else{
				pie = s.subList(re*batch_Int+1, (re+1)*batch_Int);
			}
			
			map.put(re+"", pie);
		}
	}
}
