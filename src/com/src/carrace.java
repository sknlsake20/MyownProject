package day6;

public class carrace {
		synchronized void pertolpump() {
			for (int i = 0; i <= 8; i++) {
				if (i == 8) {
					System.out.println("You are the winner " + Thread.currentThread().getName());
					System.out.println("You have reached the petrol pump");

					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

			}
		}

		synchronized void pitstop() {
			for (int i = 0; i <=8; i++) {
				if (i == 8) {
					System.out.println("You are the winner car" + Thread.currentThread().getName());
					System.out.println("You have reached the pitstop");
					notifyAll();

				}

			}

		}
}



	class CarEx {

		public static void main(String[] args) {
			carrace ex = new carrace();
			Thread t1 = new Thread(new Runnable() {

				@Override
				public void run() {
					ex.pertolpump();
					ex.pitstop();

				}

			});
			Thread t2 = new Thread(new Runnable() {

				@Override
				public void run() {
					ex.pitstop();

				}

			});
			Thread t3 = new Thread(new Runnable() {

				@Override
				public void run() {
					ex.pertolpump();
					ex.pitstop();

				}

			});
			Thread t4 = new Thread(new Runnable() {

				@Override
				public void run() {
					ex.pertolpump();
					ex.pitstop();

				}

			});
			Thread t5 = new Thread(new Runnable() {

				@Override
				public void run() {
					ex.pertolpump();
					ex.pitstop();
				}

			});
			Thread t6 = new Thread(new Runnable() {

				@Override
				public void run() {
					ex.pertolpump();
					ex.pitstop();

				}

			});
			Thread t7 = new Thread(new Runnable() {

				@Override
				public void run() {
					ex.pertolpump();
					ex.pitstop();

				}

			});
			Thread t8 = new Thread(new Runnable() {

				@Override
				public void run() {
					ex.pertolpump();
					ex.pitstop();

				}

			});
			t1.setName("BMW");
			t2.setName("tata");
			t3.setName("audi");
			t4.setName("rouger");
			t5.setName("scorpio");
			t6.setName("ford");
			t7.setName("ferrari");
			t8.setName("benz");
			t1.start();
			t2.start();
			t3.start();
			t4.start();
			t5.start();
			t6.start();
			t7.start();
			t8.start();

		}
	
}
