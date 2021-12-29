package cn.guardwhy.forkJoin;

import java.util.concurrent.RecursiveTask;
/*
* 求和计算的任务!!
* 1.使用forkjoin
* 1.1forkjoinpool 通过它来执行。
* 1.2 计算任务ForkJoinPool.excute(ForkJoinTask task)
* 1.3 计算类要继承ForkJoinTask
*/
public class ForkJoinDemo extends RecursiveTask<Long> {
    private Long start; // 起始值
    private Long end; // 结束值

    // 临界值
    private Long temp = 10000L;

    public ForkJoinDemo(Long start, Long end) {
        this.start = start;
        this.end = end;
    }

    // 计算方法
    @Override
    protected Long compute() {
        // 常规方式
        if((end - start) < temp){
            // 定义sum值
            Long sum = 0L;
            for (Long i = start; i <= end ; i++) {
                sum += i;
            }
            return sum;
        }else {
          // ForkJoin递归
            long middle = (start + end) / 2; // 中间值
            ForkJoinDemo task1 = new ForkJoinDemo(start, middle);
            // 拆分任务，把任务压入线程队列
            task1.fork();
            ForkJoinDemo task2 = new ForkJoinDemo(middle+1, end);
            // 拆分任务，把任务压入线程队列
            task2.fork();
            return task1.join() + task2.join();
        }
    }
}
