package p14;

import java.util.ArrayList;

public class MapExam {
	private ArrayList<String> alKey;
	private ArrayList<String> alValue;

	public MapExam() {
		alKey = new ArrayList<String>();
		alValue = new ArrayList<String>();
	}

	public void put(String key, String value) {
		int idx = alKey.indexOf(key);
		if (idx == -1) {
			alKey.add(key);
			alValue.add(value);
		}
		else {
			alValue.set(idx, value);
		}
	}

	public void remove(String key) {
		int idx = alKey.indexOf(key);
		alKey.remove(idx);
		alValue.remove(idx);
	}

	public int size() {
		return alKey.size();
	}

	public String get(String key) {
		int idx = alKey.indexOf(key);
		if (idx > -1) {
			return alValue.get(idx);
		}
		return null;
	}

	public String toString() {
		String result = "{ ";
		for (int i = 0; i < alKey.size(); i++) {
			result += alKey.get(i) + "=" + alValue.get(i) + " ";
		}
		return result + "}";
	}
}
