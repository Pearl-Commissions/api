package fr.pearl.api.spigot.sound;

import com.cryptomorin.xseries.XSound;

public class SoundBuilder {

    private final XSound sound;
    private final float volume;
    private final float pitch;

    public SoundBuilder(XSound sound, float volume, float pitch) {
        this.sound = sound;
        this.volume = volume;
        this.pitch = pitch;
    }

    public SoundBuilder(XSound sound) {
        this(sound, 1F, 1F);
    }

    public SoundBuilder volume(float volume) {
        return new SoundBuilder(this.sound, volume, this.pitch);
    }

    public SoundBuilder pitch(float pitch) {
        return new SoundBuilder(this.sound, this.volume, pitch);
    }

    public XSound getSound() {
        return sound;
    }

    public float getVolume() {
        return volume;
    }

    public float getPitch() {
        return pitch;
    }
}
