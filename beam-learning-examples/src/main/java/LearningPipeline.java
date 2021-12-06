import org.apache.beam.sdk.Pipeline;
import org.apache.beam.sdk.transforms.Create;

public class LearningPipeline {
    public static void main(String[] args) {
        // Always use direct runner
        Pipeline pipeline = Pipeline.create();

        pipeline.apply("", Create.of(""));

    }
}
