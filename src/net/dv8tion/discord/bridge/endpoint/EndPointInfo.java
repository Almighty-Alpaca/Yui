package net.dv8tion.discord.bridge.endpoint;

import net.dv8tion.discord.bridge.endpoint.EndPoint.EndPointType;

public class EndPointInfo
{
    public static final String SEPARATOR = ":";
    private EndPointType type;
    private String connectorId;
    private String channelId;

    public EndPointInfo(String connectorId, String channelId, EndPointType type)
    {
        this.connectorId = connectorId;
        this.channelId = channelId;
        this.type = type;
    }

    public String getConnectorId()
    {
        return connectorId;
    }

    public void setConnectorId(String connectorId)
    {
        this.connectorId = connectorId;
    }

    public String getChannelId()
    {
        return channelId;
    }

    public void setChannelId(String channelId)
    {
        this.channelId = channelId;
    }

    public String toString()
    {
        return type.getName() + SEPARATOR + connectorId + SEPARATOR + channelId;
    }

    public EndPointType getType()
    {
        return type;
    }

    public void setType(EndPointType type)
    {
        this.type = type;
    }
}
