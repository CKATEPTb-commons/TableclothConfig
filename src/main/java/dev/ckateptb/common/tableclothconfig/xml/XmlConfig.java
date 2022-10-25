package dev.ckateptb.common.tableclothconfig.xml;

import dev.ckateptb.common.tableclothconfig.AbstractConfig;
import org.spongepowered.configurate.AttributedConfigurationNode;
import org.spongepowered.configurate.loader.AbstractConfigurationLoader;
import org.spongepowered.configurate.xml.XmlConfigurationLoader;

public abstract class XmlConfig extends AbstractConfig<AttributedConfigurationNode> {
    @Override
    protected AbstractConfigurationLoader.Builder<? extends AbstractConfigurationLoader.Builder<?, ? extends AbstractConfigurationLoader<AttributedConfigurationNode>>, ? extends AbstractConfigurationLoader<AttributedConfigurationNode>> getBuilder() {
        return XmlConfigurationLoader.builder();
    }
}