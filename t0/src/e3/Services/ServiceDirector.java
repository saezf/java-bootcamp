package e3.Services;

public class ServiceDirector {
	private ServiceBuilder serviceBuilder = null;

	public ServiceDirector(ServiceBuilder serviceBuilder) {
		this.serviceBuilder = serviceBuilder;
	}

	public void constructService() {
		serviceBuilder.buildEquipment();
		serviceBuilder.buildEspecialists();
	}

	public Service getService() {
		return serviceBuilder.getService();
	}

}
