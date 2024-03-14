package Interfaces;

public interface ILights {

    boolean lights = false; // В поле должно быть значение и оно автоматически будет public и final (Ide подскажет что нет смысла эти модификаторы прописывать)

    boolean LightsOn(boolean set); //у методов просто прописывается public автоматом. Их можно переписывать иначе смысла не было бы
    void blinkLights();

}
