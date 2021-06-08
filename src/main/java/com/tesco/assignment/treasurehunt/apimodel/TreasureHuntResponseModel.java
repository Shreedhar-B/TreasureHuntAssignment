package com.tesco.assignment.treasurehunt.apimodel;

import java.util.List;

public class TreasureHuntResponseModel {

    private String message;

    private List<Node> nodes;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Node> getNodes() {
        return nodes;
    }

    public void setNodes(List<Node> nodes) {
        this.nodes = nodes;
    }

    public static class Node {
        int row;
        int column;

        public Node() {
        }

        public Node(int row, int column) {
            this.row = row;
            this.column = column;
        }

        public int getRow() {
            return row;
        }

        public void setRow(int row) {
            this.row = row;
        }

        public int getColumn() {
            return column;
        }

        public void setColumn(int column) {
            this.column = column;
        }
    }
}
