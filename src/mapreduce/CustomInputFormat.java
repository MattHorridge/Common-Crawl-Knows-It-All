package mapreduce;



import java.io.IOException;

import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.InputSplit;
import org.apache.hadoop.mapreduce.JobContext;
import org.apache.hadoop.mapreduce.RecordReader;
import org.apache.hadoop.mapreduce.TaskAttemptContext;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.KeyValueLineRecordReader;



//Input format for the text files containing URL and segment address

public class CustomInputFormat extends FileInputFormat<Text, Text> {

	@Override
	public RecordReader<Text, Text> createRecordReader(InputSplit split, TaskAttemptContext Context)
			throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		return new KeyValueLineRecordReader(Context.getConfiguration());
	}
	
	@Override
	protected boolean isSplitable(JobContext context, Path filename) {
		
		return true;
	}

}
