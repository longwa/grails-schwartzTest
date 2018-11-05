package schwartztest

import com.agileorbit.schwartz.SchwartzJob
import org.quartz.JobExecutionContext
import org.quartz.JobExecutionException

class TestJob implements SchwartzJob {
    @Override
    void buildTriggers() {
        triggers << factory("TestTrigger").intervalInSeconds(2).build()
    }

    @Override
    void execute(JobExecutionContext context) throws JobExecutionException {
        println "Executing test job..."
    }
}
