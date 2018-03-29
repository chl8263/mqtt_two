import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttException;

public class Main {
    public static void main(String []args){
        try {
            MqttClient client = new MqttClient("tcp://192.168.219.111:1883",MqttClient.generateClientId());

            //client.publish("aa","helo".getBytes(),0,false);
            client.setCallback(new MattCAllback());
            client.connect();
            client.subscribe("aa");
        } catch (MqttException e) {
            e.printStackTrace();
        }
    }
}
