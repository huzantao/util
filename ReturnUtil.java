
import com.alibaba.fastjson.JSONObject;

import java.util.List;


public class ReturnUtil {

    public static JSONObject successResult() {

        JSONObject json = new JSONObject();
        json.put("success", true);
        return json;
    }

    public static JSONObject successResult(List<?> list) {

        JSONObject json = new JSONObject();
        json.put("success", true);
        json.put("result", list);
        return json;
    }

    public static JSONObject successResult(Object object) {

        JSONObject json = new JSONObject();
        json.put("success", true);
        json.put("obj", object);
        return json;
    }

    public static JSONObject falseResult(String msg) {

        JSONObject json = new JSONObject();
        json.put("success", false);
        json.put("msg", msg);

        return json;
    }
}
