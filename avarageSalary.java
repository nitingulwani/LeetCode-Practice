class averageSalary {
    public double average(int[] salary) {
        Arrays.sort(salary);
        double sum=0;
        int n = salary.length;
        int count=0;
        for(int i=1;i<n-1;i++){
            sum+=salary[i];
            count++;
        }

        return sum/count;
    }
}