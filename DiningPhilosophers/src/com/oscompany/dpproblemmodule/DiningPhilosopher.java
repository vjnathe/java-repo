package com.oscompany.dpproblemmodule;

import java.util.Random;
import java.util.concurrent.Semaphore;

/**
 * @author Vijayraj Nathe class design to demonstrate the dining philosopher
 *         problem using multithreading.
 */
public class DiningPhilosopher extends Thread {

	private int id;
	private Semaphore leftFork;
	private Semaphore rightFork;
	private int meals = 10;

	private static Random rand = new Random();

	public DiningPhilosopher(int i, Semaphore fork1, Semaphore fork2) {
		id = i + 1;
		rightFork = fork1;
		leftFork = fork2;
	}

	/**
	 * @return void method to sleep thread for random time
	 */
	private void pause() {
		try {

			sleep(rand.nextInt(10000));
		} catch (InterruptedException e) {
		}
	}

	/**
	 * @return void method to describe that philosopher is thinking.
	 */
	private void think() {
		System.out.println("Philosopher " + this.id + " is thinking");
		pause();
	}

	private void eating() {

		System.out.println("Philosopher " + this.id
				+ " picked up his right and is eating meal #" + (10 - --meals));
		pause();

		System.out.println("Philosopher " + this.id + " puts his forks");
		rightFork.release();

	}

	/**
	 * @return void method to describe that philosopher is trying to eat and
	 *         picking up spoons. for the moment we keep it as synchronised that
	 *         no other thread allow to enter when one philosopher selecting
	 *         spoons.
	 */
	private synchronized void selectFork() {
		System.out.println("Philosopher " + this.id
				+ " is hungry and is trying to pick up left fork");
		try {

			leftFork.acquire();
			System.out.println("Philosopher " + this.id + " pick up left fork");
			if (!rightFork.tryAcquire()) {

				System.out.println("Philosopher " + this.id
						+ " was not able to get his right fork");
				return;
			}

			this.eating();

		} catch (InterruptedException e) {

			System.out.println("Philosopher " + this.id
					+ " was interrupted while waiting for left fork");
		} finally {
			leftFork.release();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Thread#run() overriden method to run thread.
	 */
	@Override
	public void run() {
		while (true) {
			think();
			selectFork();
		}
	}

	/**
	 * @param args
	 *            main method for starting point of execution
	 */
	public static void main(String[] args) {
		System.out.println("Begin");

		final int N = 5;

		Semaphore[] fork = new Semaphore[N];
		for (int f = 0; f < N; f++) {

			fork[f] = new Semaphore(1, true);
		}

		DiningPhilosopher[] philosopher = new DiningPhilosopher[N];
		for (int myleft = 0; myleft < N; myleft++) {

			int myright = myleft + 1;
			if (myright == N)
				myright = 0;

			philosopher[myleft] = new DiningPhilosopher(myleft, fork[myleft],
					fork[myright]);
		}

		for (int i = 0; i < N; i++) {
			philosopher[i].start();
		}

		for (int i = 0; i < N; i++) {
			try {
				philosopher[i].join();
			} catch (InterruptedException ex) {
			}
		}

		System.out.println("Done");
	}
}
