package com.phongnx.map.directions.route;

import java.util.List;

/**
 * Created by PhongNX on 01/11/2017.
 */
public interface RoutingListener {
    void onRoutingFailure(RouteException e);

    void onRoutingStart();

    void onRoutingSuccess(List<Route> route, int shortestRouteIndex);

    void onRoutingCancelled();
}
