package mave_proyect;

import java.util.Date;

public class ExchangeRateResponse {
    private boolean success;
    private Query query;
    private Info info;
    private Date date;
    private double result;

   
    public boolean isSuccess() {
        return success;
    }

    public Query getQuery() {
        return query;
    }

    public Info getInfo() {
        return info;
    }

    public Date getDate() {
        return date;
    }

    public double getResult() {
        return result;
    }

    public class Query {
        private String from;
        private String to;
        private double amount;

        public String getFrom() {
            return from;
        }

        public String getTo() {
            return to;
        }

        public double getAmount() {
            return amount;
        }
    }

    public class Info {
        private long timestamp;
        private double rate;

        public long getTimestamp() {
            return timestamp;
        }

        public double getRate() {
            return rate;
        }
    }
}
