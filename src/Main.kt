import java.awt.Color.blue

/**
 * @author Ankit Kumar (ankitdroiddeveloper@gmail.com) on 2/7/18
 */
class Main {
    fun main(args: Array<String>) {

        progress {
            // long-term job
            Thread.sleep(1500)
        }

        progress(message = "",
                frames = Frames.dots8.map(String::blue),
                done = Frames.done.green()) {

            // long-term job
            (0..100).forEach {
                message = "$it%".bold()
                Thread.sleep(50)
            }
        }
    }
}