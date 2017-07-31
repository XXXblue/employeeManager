package po;

import java.util.ArrayList;
import java.util.List;

public class DevelopmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DevelopmentExample() {
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

        public Criteria andDNoIsNull() {
            addCriterion("D_NO is null");
            return (Criteria) this;
        }

        public Criteria andDNoIsNotNull() {
            addCriterion("D_NO is not null");
            return (Criteria) this;
        }

        public Criteria andDNoEqualTo(Long value) {
            addCriterion("D_NO =", value, "dNo");
            return (Criteria) this;
        }

        public Criteria andDNoNotEqualTo(Long value) {
            addCriterion("D_NO <>", value, "dNo");
            return (Criteria) this;
        }

        public Criteria andDNoGreaterThan(Long value) {
            addCriterion("D_NO >", value, "dNo");
            return (Criteria) this;
        }

        public Criteria andDNoGreaterThanOrEqualTo(Long value) {
            addCriterion("D_NO >=", value, "dNo");
            return (Criteria) this;
        }

        public Criteria andDNoLessThan(Long value) {
            addCriterion("D_NO <", value, "dNo");
            return (Criteria) this;
        }

        public Criteria andDNoLessThanOrEqualTo(Long value) {
            addCriterion("D_NO <=", value, "dNo");
            return (Criteria) this;
        }

        public Criteria andDNoIn(List<Long> values) {
            addCriterion("D_NO in", values, "dNo");
            return (Criteria) this;
        }

        public Criteria andDNoNotIn(List<Long> values) {
            addCriterion("D_NO not in", values, "dNo");
            return (Criteria) this;
        }

        public Criteria andDNoBetween(Long value1, Long value2) {
            addCriterion("D_NO between", value1, value2, "dNo");
            return (Criteria) this;
        }

        public Criteria andDNoNotBetween(Long value1, Long value2) {
            addCriterion("D_NO not between", value1, value2, "dNo");
            return (Criteria) this;
        }

        public Criteria andDNameIsNull() {
            addCriterion("D_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDNameIsNotNull() {
            addCriterion("D_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDNameEqualTo(String value) {
            addCriterion("D_NAME =", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameNotEqualTo(String value) {
            addCriterion("D_NAME <>", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameGreaterThan(String value) {
            addCriterion("D_NAME >", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameGreaterThanOrEqualTo(String value) {
            addCriterion("D_NAME >=", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameLessThan(String value) {
            addCriterion("D_NAME <", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameLessThanOrEqualTo(String value) {
            addCriterion("D_NAME <=", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameLike(String value) {
            addCriterion("D_NAME like", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameNotLike(String value) {
            addCriterion("D_NAME not like", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameIn(List<String> values) {
            addCriterion("D_NAME in", values, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameNotIn(List<String> values) {
            addCriterion("D_NAME not in", values, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameBetween(String value1, String value2) {
            addCriterion("D_NAME between", value1, value2, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameNotBetween(String value1, String value2) {
            addCriterion("D_NAME not between", value1, value2, "dName");
            return (Criteria) this;
        }

        public Criteria andDNoteIsNull() {
            addCriterion("D_NOTE is null");
            return (Criteria) this;
        }

        public Criteria andDNoteIsNotNull() {
            addCriterion("D_NOTE is not null");
            return (Criteria) this;
        }

        public Criteria andDNoteEqualTo(String value) {
            addCriterion("D_NOTE =", value, "dNote");
            return (Criteria) this;
        }

        public Criteria andDNoteNotEqualTo(String value) {
            addCriterion("D_NOTE <>", value, "dNote");
            return (Criteria) this;
        }

        public Criteria andDNoteGreaterThan(String value) {
            addCriterion("D_NOTE >", value, "dNote");
            return (Criteria) this;
        }

        public Criteria andDNoteGreaterThanOrEqualTo(String value) {
            addCriterion("D_NOTE >=", value, "dNote");
            return (Criteria) this;
        }

        public Criteria andDNoteLessThan(String value) {
            addCriterion("D_NOTE <", value, "dNote");
            return (Criteria) this;
        }

        public Criteria andDNoteLessThanOrEqualTo(String value) {
            addCriterion("D_NOTE <=", value, "dNote");
            return (Criteria) this;
        }

        public Criteria andDNoteLike(String value) {
            addCriterion("D_NOTE like", value, "dNote");
            return (Criteria) this;
        }

        public Criteria andDNoteNotLike(String value) {
            addCriterion("D_NOTE not like", value, "dNote");
            return (Criteria) this;
        }

        public Criteria andDNoteIn(List<String> values) {
            addCriterion("D_NOTE in", values, "dNote");
            return (Criteria) this;
        }

        public Criteria andDNoteNotIn(List<String> values) {
            addCriterion("D_NOTE not in", values, "dNote");
            return (Criteria) this;
        }

        public Criteria andDNoteBetween(String value1, String value2) {
            addCriterion("D_NOTE between", value1, value2, "dNote");
            return (Criteria) this;
        }

        public Criteria andDNoteNotBetween(String value1, String value2) {
            addCriterion("D_NOTE not between", value1, value2, "dNote");
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