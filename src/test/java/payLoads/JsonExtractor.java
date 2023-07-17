package payLoads;

import io.restassured.path.json.JsonPath;

public class JsonExtractor {
	public static JsonPath objectJP(String JPString) {
		JsonPath jp = new JsonPath(JPString);
		return jp;
	}
}
