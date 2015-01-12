package e3.Equipment;

public class EquipmentFactory {
	private static EquipmentFactory equipmnetFactory = null;

	private EquipmentFactory() {
	}

	public static EquipmentFactory getInstance() {
		if (equipmnetFactory == null) {
			equipmnetFactory = new EquipmentFactory();
		}
		return equipmnetFactory;
	}
	
	public Equipment getEquipment(String service) {
		switch (service) {
		case "Operating room":
			return new MultipleEquipment("Operating room", 0.65);	
		case "M.R.I.":
			return new SingleEquipment("M.R.I");
		case "X-ray Unit":
			return new MultipleEquipment("X-ray Unit", 0.25);
		case "Anaesthetic machine":
			return new MultipleEquipment("Anaesthetic machine", 0.65);
		case "Consultorie":
			return new MultipleEquipment("Consultorie", 0.55);
		default: 
			break;
			

		}
		return null;
	}
}
	