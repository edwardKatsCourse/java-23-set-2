package com.company;

import java.util.Objects;

public class CPU implements Comparable<CPU> {

    private String cpuBrand;
    private Integer cores;
    private Integer threads;
    private Integer manufacturingYear;

    public CPU(String cpuBrand, Integer cores, Integer threads, Integer manufacturingYear) {
        this.cpuBrand = cpuBrand;
        this.cores = cores;
        this.threads = threads;
        this.manufacturingYear = manufacturingYear;
    }

    public String getCpuBrand() {
        return cpuBrand;
    }

    public void setCpuBrand(String cpuBrand) {
        this.cpuBrand = cpuBrand;
    }

    public Integer getCores() {
        return cores;
    }

    public void setCores(Integer cores) {
        this.cores = cores;
    }

    public Integer getThreads() {
        return threads;
    }

    public void setThreads(Integer threads) {
        this.threads = threads;
    }

    public Integer getManufacturingYear() {
        return manufacturingYear;
    }

    public void setManufacturingYear(Integer manufacturingYear) {
        this.manufacturingYear = manufacturingYear;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("equals");

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CPU cpu = (CPU) o;
        return Objects.equals(cpuBrand, cpu.cpuBrand) &&
                Objects.equals(cores, cpu.cores) &&
                Objects.equals(threads, cpu.threads) &&
                Objects.equals(manufacturingYear, cpu.manufacturingYear);
    }

    @Override
    public int hashCode() {
        System.out.println("hashCode");

        return Objects.hash(cpuBrand, cores, threads, manufacturingYear);
    }

    @Override
    public String toString() {
        return "CPU: " +
                "cpuBrand = '" + cpuBrand + '\'' +
                ", cores = " + cores +
                ", threads = " + threads +
                ", manufacturingYear = " + manufacturingYear;
    }

    //{string:a, person: person A3},

    //{string:b, person: person B}

    @Override
    public int compareTo(CPU otherCPU) {
        int result = this.getCores().compareTo(otherCPU.getCores());
        if (result == 0) {
            result = this.getThreads().compareTo(otherCPU.getThreads());
        }

        if (result == 0) {
            result = this.getCpuBrand().compareTo(otherCPU.getCpuBrand());
        }
        return result;
    }
}
