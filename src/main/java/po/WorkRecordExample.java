package po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class WorkRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WorkRecordExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andWIdIsNull() {
            addCriterion("W_Id is null");
            return (Criteria) this;
        }

        public Criteria andWIdIsNotNull() {
            addCriterion("W_Id is not null");
            return (Criteria) this;
        }

        public Criteria andWIdEqualTo(Long value) {
            addCriterion("W_Id =", value, "wId");
            return (Criteria) this;
        }

        public Criteria andWIdNotEqualTo(Long value) {
            addCriterion("W_Id <>", value, "wId");
            return (Criteria) this;
        }

        public Criteria andWIdGreaterThan(Long value) {
            addCriterion("W_Id >", value, "wId");
            return (Criteria) this;
        }

        public Criteria andWIdGreaterThanOrEqualTo(Long value) {
            addCriterion("W_Id >=", value, "wId");
            return (Criteria) this;
        }

        public Criteria andWIdLessThan(Long value) {
            addCriterion("W_Id <", value, "wId");
            return (Criteria) this;
        }

        public Criteria andWIdLessThanOrEqualTo(Long value) {
            addCriterion("W_Id <=", value, "wId");
            return (Criteria) this;
        }

        public Criteria andWIdIn(List<Long> values) {
            addCriterion("W_Id in", values, "wId");
            return (Criteria) this;
        }

        public Criteria andWIdNotIn(List<Long> values) {
            addCriterion("W_Id not in", values, "wId");
            return (Criteria) this;
        }

        public Criteria andWIdBetween(Long value1, Long value2) {
            addCriterion("W_Id between", value1, value2, "wId");
            return (Criteria) this;
        }

        public Criteria andWIdNotBetween(Long value1, Long value2) {
            addCriterion("W_Id not between", value1, value2, "wId");
            return (Criteria) this;
        }

        public Criteria andWTypeIsNull() {
            addCriterion("W_Type is null");
            return (Criteria) this;
        }

        public Criteria andWTypeIsNotNull() {
            addCriterion("W_Type is not null");
            return (Criteria) this;
        }

        public Criteria andWTypeEqualTo(Integer value) {
            addCriterion("W_Type =", value, "wType");
            return (Criteria) this;
        }

        public Criteria andWTypeNotEqualTo(Integer value) {
            addCriterion("W_Type <>", value, "wType");
            return (Criteria) this;
        }

        public Criteria andWTypeGreaterThan(Integer value) {
            addCriterion("W_Type >", value, "wType");
            return (Criteria) this;
        }

        public Criteria andWTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("W_Type >=", value, "wType");
            return (Criteria) this;
        }

        public Criteria andWTypeLessThan(Integer value) {
            addCriterion("W_Type <", value, "wType");
            return (Criteria) this;
        }

        public Criteria andWTypeLessThanOrEqualTo(Integer value) {
            addCriterion("W_Type <=", value, "wType");
            return (Criteria) this;
        }

        public Criteria andWTypeIn(List<Integer> values) {
            addCriterion("W_Type in", values, "wType");
            return (Criteria) this;
        }

        public Criteria andWTypeNotIn(List<Integer> values) {
            addCriterion("W_Type not in", values, "wType");
            return (Criteria) this;
        }

        public Criteria andWTypeBetween(Integer value1, Integer value2) {
            addCriterion("W_Type between", value1, value2, "wType");
            return (Criteria) this;
        }

        public Criteria andWTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("W_Type not between", value1, value2, "wType");
            return (Criteria) this;
        }

        public Criteria andWNoIsNull() {
            addCriterion("W_No is null");
            return (Criteria) this;
        }

        public Criteria andWNoIsNotNull() {
            addCriterion("W_No is not null");
            return (Criteria) this;
        }

        public Criteria andWNoEqualTo(Long value) {
            addCriterion("W_No =", value, "wNo");
            return (Criteria) this;
        }

        public Criteria andWNoNotEqualTo(Long value) {
            addCriterion("W_No <>", value, "wNo");
            return (Criteria) this;
        }

        public Criteria andWNoGreaterThan(Long value) {
            addCriterion("W_No >", value, "wNo");
            return (Criteria) this;
        }

        public Criteria andWNoGreaterThanOrEqualTo(Long value) {
            addCriterion("W_No >=", value, "wNo");
            return (Criteria) this;
        }

        public Criteria andWNoLessThan(Long value) {
            addCriterion("W_No <", value, "wNo");
            return (Criteria) this;
        }

        public Criteria andWNoLessThanOrEqualTo(Long value) {
            addCriterion("W_No <=", value, "wNo");
            return (Criteria) this;
        }

        public Criteria andWNoIn(List<Long> values) {
            addCriterion("W_No in", values, "wNo");
            return (Criteria) this;
        }

        public Criteria andWNoNotIn(List<Long> values) {
            addCriterion("W_No not in", values, "wNo");
            return (Criteria) this;
        }

        public Criteria andWNoBetween(Long value1, Long value2) {
            addCriterion("W_No between", value1, value2, "wNo");
            return (Criteria) this;
        }

        public Criteria andWNoNotBetween(Long value1, Long value2) {
            addCriterion("W_No not between", value1, value2, "wNo");
            return (Criteria) this;
        }

        public Criteria andWApproveIsNull() {
            addCriterion("W_APPROVE is null");
            return (Criteria) this;
        }

        public Criteria andWApproveIsNotNull() {
            addCriterion("W_APPROVE is not null");
            return (Criteria) this;
        }

        public Criteria andWApproveEqualTo(Integer value) {
            addCriterion("W_APPROVE =", value, "wApprove");
            return (Criteria) this;
        }

        public Criteria andWApproveNotEqualTo(Integer value) {
            addCriterion("W_APPROVE <>", value, "wApprove");
            return (Criteria) this;
        }

        public Criteria andWApproveGreaterThan(Integer value) {
            addCriterion("W_APPROVE >", value, "wApprove");
            return (Criteria) this;
        }

        public Criteria andWApproveGreaterThanOrEqualTo(Integer value) {
            addCriterion("W_APPROVE >=", value, "wApprove");
            return (Criteria) this;
        }

        public Criteria andWApproveLessThan(Integer value) {
            addCriterion("W_APPROVE <", value, "wApprove");
            return (Criteria) this;
        }

        public Criteria andWApproveLessThanOrEqualTo(Integer value) {
            addCriterion("W_APPROVE <=", value, "wApprove");
            return (Criteria) this;
        }

        public Criteria andWApproveIn(List<Integer> values) {
            addCriterion("W_APPROVE in", values, "wApprove");
            return (Criteria) this;
        }

        public Criteria andWApproveNotIn(List<Integer> values) {
            addCriterion("W_APPROVE not in", values, "wApprove");
            return (Criteria) this;
        }

        public Criteria andWApproveBetween(Integer value1, Integer value2) {
            addCriterion("W_APPROVE between", value1, value2, "wApprove");
            return (Criteria) this;
        }

        public Criteria andWApproveNotBetween(Integer value1, Integer value2) {
            addCriterion("W_APPROVE not between", value1, value2, "wApprove");
            return (Criteria) this;
        }

        public Criteria andWDurationIsNull() {
            addCriterion("W_DURATION is null");
            return (Criteria) this;
        }

        public Criteria andWDurationIsNotNull() {
            addCriterion("W_DURATION is not null");
            return (Criteria) this;
        }

        public Criteria andWDurationEqualTo(Integer value) {
            addCriterion("W_DURATION =", value, "wDuration");
            return (Criteria) this;
        }

        public Criteria andWDurationNotEqualTo(Integer value) {
            addCriterion("W_DURATION <>", value, "wDuration");
            return (Criteria) this;
        }

        public Criteria andWDurationGreaterThan(Integer value) {
            addCriterion("W_DURATION >", value, "wDuration");
            return (Criteria) this;
        }

        public Criteria andWDurationGreaterThanOrEqualTo(Integer value) {
            addCriterion("W_DURATION >=", value, "wDuration");
            return (Criteria) this;
        }

        public Criteria andWDurationLessThan(Integer value) {
            addCriterion("W_DURATION <", value, "wDuration");
            return (Criteria) this;
        }

        public Criteria andWDurationLessThanOrEqualTo(Integer value) {
            addCriterion("W_DURATION <=", value, "wDuration");
            return (Criteria) this;
        }

        public Criteria andWDurationIn(List<Integer> values) {
            addCriterion("W_DURATION in", values, "wDuration");
            return (Criteria) this;
        }

        public Criteria andWDurationNotIn(List<Integer> values) {
            addCriterion("W_DURATION not in", values, "wDuration");
            return (Criteria) this;
        }

        public Criteria andWDurationBetween(Integer value1, Integer value2) {
            addCriterion("W_DURATION between", value1, value2, "wDuration");
            return (Criteria) this;
        }

        public Criteria andWDurationNotBetween(Integer value1, Integer value2) {
            addCriterion("W_DURATION not between", value1, value2, "wDuration");
            return (Criteria) this;
        }

        public Criteria andWDateIsNull() {
            addCriterion("W_DATE is null");
            return (Criteria) this;
        }

        public Criteria andWDateIsNotNull() {
            addCriterion("W_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andWDateEqualTo(Date value) {
            addCriterionForJDBCDate("W_DATE =", value, "wDate");
            return (Criteria) this;
        }

        public Criteria andWDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("W_DATE <>", value, "wDate");
            return (Criteria) this;
        }

        public Criteria andWDateGreaterThan(Date value) {
            addCriterionForJDBCDate("W_DATE >", value, "wDate");
            return (Criteria) this;
        }

        public Criteria andWDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("W_DATE >=", value, "wDate");
            return (Criteria) this;
        }

        public Criteria andWDateLessThan(Date value) {
            addCriterionForJDBCDate("W_DATE <", value, "wDate");
            return (Criteria) this;
        }

        public Criteria andWDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("W_DATE <=", value, "wDate");
            return (Criteria) this;
        }

        public Criteria andWDateIn(List<Date> values) {
            addCriterionForJDBCDate("W_DATE in", values, "wDate");
            return (Criteria) this;
        }

        public Criteria andWDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("W_DATE not in", values, "wDate");
            return (Criteria) this;
        }

        public Criteria andWDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("W_DATE between", value1, value2, "wDate");
            return (Criteria) this;
        }

        public Criteria andWDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("W_DATE not between", value1, value2, "wDate");
            return (Criteria) this;
        }

        public Criteria andWReasonIsNull() {
            addCriterion("W_REASON is null");
            return (Criteria) this;
        }

        public Criteria andWReasonIsNotNull() {
            addCriterion("W_REASON is not null");
            return (Criteria) this;
        }

        public Criteria andWReasonEqualTo(String value) {
            addCriterion("W_REASON =", value, "wReason");
            return (Criteria) this;
        }

        public Criteria andWReasonNotEqualTo(String value) {
            addCriterion("W_REASON <>", value, "wReason");
            return (Criteria) this;
        }

        public Criteria andWReasonGreaterThan(String value) {
            addCriterion("W_REASON >", value, "wReason");
            return (Criteria) this;
        }

        public Criteria andWReasonGreaterThanOrEqualTo(String value) {
            addCriterion("W_REASON >=", value, "wReason");
            return (Criteria) this;
        }

        public Criteria andWReasonLessThan(String value) {
            addCriterion("W_REASON <", value, "wReason");
            return (Criteria) this;
        }

        public Criteria andWReasonLessThanOrEqualTo(String value) {
            addCriterion("W_REASON <=", value, "wReason");
            return (Criteria) this;
        }

        public Criteria andWReasonLike(String value) {
            addCriterion("W_REASON like", value, "wReason");
            return (Criteria) this;
        }

        public Criteria andWReasonNotLike(String value) {
            addCriterion("W_REASON not like", value, "wReason");
            return (Criteria) this;
        }

        public Criteria andWReasonIn(List<String> values) {
            addCriterion("W_REASON in", values, "wReason");
            return (Criteria) this;
        }

        public Criteria andWReasonNotIn(List<String> values) {
            addCriterion("W_REASON not in", values, "wReason");
            return (Criteria) this;
        }

        public Criteria andWReasonBetween(String value1, String value2) {
            addCriterion("W_REASON between", value1, value2, "wReason");
            return (Criteria) this;
        }

        public Criteria andWReasonNotBetween(String value1, String value2) {
            addCriterion("W_REASON not between", value1, value2, "wReason");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}