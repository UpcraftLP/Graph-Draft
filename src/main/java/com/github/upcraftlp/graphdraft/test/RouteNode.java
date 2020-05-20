package com.github.upcraftlp.graphdraft.test;

import org.jetbrains.annotations.NotNull;

public class RouteNode<T extends GNode> implements Comparable<RouteNode<T>> {

    private final T current;
    private T previous;
    private double routeScore;
    private double estimatedScore;

    RouteNode(T current) {
        this(current, null, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
    }

    RouteNode(T current, T previous, double routeScore, double estimatedScore) {
        this.current = current;
        this.previous = previous;
        this.routeScore = routeScore;
        this.estimatedScore = estimatedScore;
    }

    @Override
    public int compareTo(@NotNull RouteNode<T> o) {
        return Double.compare(this.estimatedScore, o.estimatedScore);
    }

    public T getCurrent() {
        return this.current;
    }

    public double getRouteScore() {
        return this.routeScore;
    }

    public void setPrevious(T previous) {
        this.previous = previous;
    }

    public void setRouteScore(double newScore) {
        this.routeScore = newScore;
    }

    public void setEstimatedScore(double score) {
        this.estimatedScore = score;
    }

    public T getPrevious() {
        return this.previous;
    }
}
