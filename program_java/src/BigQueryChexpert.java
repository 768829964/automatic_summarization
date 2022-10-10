import java.io.File;

public class BigQueryChexpert {
	public static void main(String[] args) {
		String path = "D:\\automatic_summarization2\\automatic_summarization\\mimic-cxr-reports-morethan25-died";
		File file = new File(path);
		File[] fs = file.listFiles();
		for (File f:fs) {
			if (f.isDirectory()){
				System.out.println(f);
			}
		}
		StringBuilder result = new StringBuilder("(");
		for (File f:fs) {
			if (f.isDirectory()){
				String newf = f.toString();
				String newf1 = newf.substring(newf.length()-8,newf.length());
				result.append(newf1).append(",");
			}
		}
		System.out.println(result);
	}
}
