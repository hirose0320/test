
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class aaasa {

	public static void main(String[] args) {
		// Mapの宣言
		Map<String, Integer> map = new HashMap<String, Integer>();

		// Mapに要素を追加
		map.put("apple", 100);
		map.put("orange", 200);
		map.put("melon", 300);

		// Iterator<Map.Entry<String, Integer>> の宣言
		Iterator<Map.Entry<String, Integer>> itr = map.entrySet().iterator();

		// key, valueの取得
		while (itr.hasNext()) {
			// nextを使用して値を取得する
			Map.Entry<String, Integer> entry = itr.next();

			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

}
