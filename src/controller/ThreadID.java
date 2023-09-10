package controller;

public class ThreadID extends Thread{
	
	private int IdThread;
	
	public ThreadID(int IdThread) {
		this.IdThread = IdThread;
	}
	
	public void run() {
		System.out.println(IdThread + " - TID: " + getId());
	}
}
