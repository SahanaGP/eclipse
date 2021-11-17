package com.xworkz.headset.starter;

	import com.xworkz.headset.parent.Headset;
	import com.xworkz.headset.parent.HeadsetTypes;

	public class HeadsetStarter {

		public static void main(String[] args) {

			Headset headset = new Headset();
			headset.setBrand("BOAT");
			headset.setBattery(90.08f);
			headset.setType(HeadsetTypes.ON_EAR);
			headset.setWarranty(5);

			Headset headset2 = new Headset();
			headset2.setBrand("BOAT");
			headset2.setBattery(150.99f);
			headset2.setType(HeadsetTypes.NOISE_CANCELLING);
			headset2.setWarranty(5);

			if (headset == headset2) {
				System.out.println("both are pointing to same memory location");
			}

			boolean same = headset.equals(headset2);
			System.out.println(same);
		}

	}

