package com.phongnx.map.directions.route;

import java.util.List;

/**
 * Created by PhongNX on 01/11/2017.
 */
public interface Parser {
    List<Route> parse() throws RouteException;
}