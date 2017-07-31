package po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class EmployeeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmployeeExample() {
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

        public Criteria andENoIsNull() {
            addCriterion("E_NO is null");
            return (Criteria) this;
        }

        public Criteria andENoIsNotNull() {
            addCriterion("E_NO is not null");
            return (Criteria) this;
        }

        public Criteria andENoEqualTo(Long value) {
            addCriterion("E_NO =", value, "eNo");
            return (Criteria) this;
        }

        public Criteria andENoNotEqualTo(Long value) {
            addCriterion("E_NO <>", value, "eNo");
            return (Criteria) this;
        }

        public Criteria andENoGreaterThan(Long value) {
            addCriterion("E_NO >", value, "eNo");
            return (Criteria) this;
        }

        public Criteria andENoGreaterThanOrEqualTo(Long value) {
            addCriterion("E_NO >=", value, "eNo");
            return (Criteria) this;
        }

        public Criteria andENoLessThan(Long value) {
            addCriterion("E_NO <", value, "eNo");
            return (Criteria) this;
        }

        public Criteria andENoLessThanOrEqualTo(Long value) {
            addCriterion("E_NO <=", value, "eNo");
            return (Criteria) this;
        }

        public Criteria andENoIn(List<Long> values) {
            addCriterion("E_NO in", values, "eNo");
            return (Criteria) this;
        }

        public Criteria andENoNotIn(List<Long> values) {
            addCriterion("E_NO not in", values, "eNo");
            return (Criteria) this;
        }

        public Criteria andENoBetween(Long value1, Long value2) {
            addCriterion("E_NO between", value1, value2, "eNo");
            return (Criteria) this;
        }

        public Criteria andENoNotBetween(Long value1, Long value2) {
            addCriterion("E_NO not between", value1, value2, "eNo");
            return (Criteria) this;
        }

        public Criteria andENameIsNull() {
            addCriterion("E_NAME is null");
            return (Criteria) this;
        }

        public Criteria andENameIsNotNull() {
            addCriterion("E_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andENameEqualTo(String value) {
            addCriterion("E_NAME =", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameNotEqualTo(String value) {
            addCriterion("E_NAME <>", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameGreaterThan(String value) {
            addCriterion("E_NAME >", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameGreaterThanOrEqualTo(String value) {
            addCriterion("E_NAME >=", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameLessThan(String value) {
            addCriterion("E_NAME <", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameLessThanOrEqualTo(String value) {
            addCriterion("E_NAME <=", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameLike(String value) {
            addCriterion("E_NAME like", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameNotLike(String value) {
            addCriterion("E_NAME not like", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameIn(List<String> values) {
            addCriterion("E_NAME in", values, "eName");
            return (Criteria) this;
        }

        public Criteria andENameNotIn(List<String> values) {
            addCriterion("E_NAME not in", values, "eName");
            return (Criteria) this;
        }

        public Criteria andENameBetween(String value1, String value2) {
            addCriterion("E_NAME between", value1, value2, "eName");
            return (Criteria) this;
        }

        public Criteria andENameNotBetween(String value1, String value2) {
            addCriterion("E_NAME not between", value1, value2, "eName");
            return (Criteria) this;
        }

        public Criteria andEPswIsNull() {
            addCriterion("E_PSW is null");
            return (Criteria) this;
        }

        public Criteria andEPswIsNotNull() {
            addCriterion("E_PSW is not null");
            return (Criteria) this;
        }

        public Criteria andEPswEqualTo(String value) {
            addCriterion("E_PSW =", value, "ePsw");
            return (Criteria) this;
        }

        public Criteria andEPswNotEqualTo(String value) {
            addCriterion("E_PSW <>", value, "ePsw");
            return (Criteria) this;
        }

        public Criteria andEPswGreaterThan(String value) {
            addCriterion("E_PSW >", value, "ePsw");
            return (Criteria) this;
        }

        public Criteria andEPswGreaterThanOrEqualTo(String value) {
            addCriterion("E_PSW >=", value, "ePsw");
            return (Criteria) this;
        }

        public Criteria andEPswLessThan(String value) {
            addCriterion("E_PSW <", value, "ePsw");
            return (Criteria) this;
        }

        public Criteria andEPswLessThanOrEqualTo(String value) {
            addCriterion("E_PSW <=", value, "ePsw");
            return (Criteria) this;
        }

        public Criteria andEPswLike(String value) {
            addCriterion("E_PSW like", value, "ePsw");
            return (Criteria) this;
        }

        public Criteria andEPswNotLike(String value) {
            addCriterion("E_PSW not like", value, "ePsw");
            return (Criteria) this;
        }

        public Criteria andEPswIn(List<String> values) {
            addCriterion("E_PSW in", values, "ePsw");
            return (Criteria) this;
        }

        public Criteria andEPswNotIn(List<String> values) {
            addCriterion("E_PSW not in", values, "ePsw");
            return (Criteria) this;
        }

        public Criteria andEPswBetween(String value1, String value2) {
            addCriterion("E_PSW between", value1, value2, "ePsw");
            return (Criteria) this;
        }

        public Criteria andEPswNotBetween(String value1, String value2) {
            addCriterion("E_PSW not between", value1, value2, "ePsw");
            return (Criteria) this;
        }

        public Criteria andETelIsNull() {
            addCriterion("E_TEL is null");
            return (Criteria) this;
        }

        public Criteria andETelIsNotNull() {
            addCriterion("E_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andETelEqualTo(String value) {
            addCriterion("E_TEL =", value, "eTel");
            return (Criteria) this;
        }

        public Criteria andETelNotEqualTo(String value) {
            addCriterion("E_TEL <>", value, "eTel");
            return (Criteria) this;
        }

        public Criteria andETelGreaterThan(String value) {
            addCriterion("E_TEL >", value, "eTel");
            return (Criteria) this;
        }

        public Criteria andETelGreaterThanOrEqualTo(String value) {
            addCriterion("E_TEL >=", value, "eTel");
            return (Criteria) this;
        }

        public Criteria andETelLessThan(String value) {
            addCriterion("E_TEL <", value, "eTel");
            return (Criteria) this;
        }

        public Criteria andETelLessThanOrEqualTo(String value) {
            addCriterion("E_TEL <=", value, "eTel");
            return (Criteria) this;
        }

        public Criteria andETelLike(String value) {
            addCriterion("E_TEL like", value, "eTel");
            return (Criteria) this;
        }

        public Criteria andETelNotLike(String value) {
            addCriterion("E_TEL not like", value, "eTel");
            return (Criteria) this;
        }

        public Criteria andETelIn(List<String> values) {
            addCriterion("E_TEL in", values, "eTel");
            return (Criteria) this;
        }

        public Criteria andETelNotIn(List<String> values) {
            addCriterion("E_TEL not in", values, "eTel");
            return (Criteria) this;
        }

        public Criteria andETelBetween(String value1, String value2) {
            addCriterion("E_TEL between", value1, value2, "eTel");
            return (Criteria) this;
        }

        public Criteria andETelNotBetween(String value1, String value2) {
            addCriterion("E_TEL not between", value1, value2, "eTel");
            return (Criteria) this;
        }

        public Criteria andEBdateIsNull() {
            addCriterion("E_BDATE is null");
            return (Criteria) this;
        }

        public Criteria andEBdateIsNotNull() {
            addCriterion("E_BDATE is not null");
            return (Criteria) this;
        }

        public Criteria andEBdateEqualTo(Date value) {
            addCriterionForJDBCDate("E_BDATE =", value, "eBdate");
            return (Criteria) this;
        }

        public Criteria andEBdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("E_BDATE <>", value, "eBdate");
            return (Criteria) this;
        }

        public Criteria andEBdateGreaterThan(Date value) {
            addCriterionForJDBCDate("E_BDATE >", value, "eBdate");
            return (Criteria) this;
        }

        public Criteria andEBdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("E_BDATE >=", value, "eBdate");
            return (Criteria) this;
        }

        public Criteria andEBdateLessThan(Date value) {
            addCriterionForJDBCDate("E_BDATE <", value, "eBdate");
            return (Criteria) this;
        }

        public Criteria andEBdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("E_BDATE <=", value, "eBdate");
            return (Criteria) this;
        }

        public Criteria andEBdateIn(List<Date> values) {
            addCriterionForJDBCDate("E_BDATE in", values, "eBdate");
            return (Criteria) this;
        }

        public Criteria andEBdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("E_BDATE not in", values, "eBdate");
            return (Criteria) this;
        }

        public Criteria andEBdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("E_BDATE between", value1, value2, "eBdate");
            return (Criteria) this;
        }

        public Criteria andEBdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("E_BDATE not between", value1, value2, "eBdate");
            return (Criteria) this;
        }

        public Criteria andEDevelopNoIsNull() {
            addCriterion("E_DEVELOP_NO is null");
            return (Criteria) this;
        }

        public Criteria andEDevelopNoIsNotNull() {
            addCriterion("E_DEVELOP_NO is not null");
            return (Criteria) this;
        }

        public Criteria andEDevelopNoEqualTo(Long value) {
            addCriterion("E_DEVELOP_NO =", value, "eDevelopNo");
            return (Criteria) this;
        }

        public Criteria andEDevelopNoNotEqualTo(Long value) {
            addCriterion("E_DEVELOP_NO <>", value, "eDevelopNo");
            return (Criteria) this;
        }

        public Criteria andEDevelopNoGreaterThan(Long value) {
            addCriterion("E_DEVELOP_NO >", value, "eDevelopNo");
            return (Criteria) this;
        }

        public Criteria andEDevelopNoGreaterThanOrEqualTo(Long value) {
            addCriterion("E_DEVELOP_NO >=", value, "eDevelopNo");
            return (Criteria) this;
        }

        public Criteria andEDevelopNoLessThan(Long value) {
            addCriterion("E_DEVELOP_NO <", value, "eDevelopNo");
            return (Criteria) this;
        }

        public Criteria andEDevelopNoLessThanOrEqualTo(Long value) {
            addCriterion("E_DEVELOP_NO <=", value, "eDevelopNo");
            return (Criteria) this;
        }

        public Criteria andEDevelopNoIn(List<Long> values) {
            addCriterion("E_DEVELOP_NO in", values, "eDevelopNo");
            return (Criteria) this;
        }

        public Criteria andEDevelopNoNotIn(List<Long> values) {
            addCriterion("E_DEVELOP_NO not in", values, "eDevelopNo");
            return (Criteria) this;
        }

        public Criteria andEDevelopNoBetween(Long value1, Long value2) {
            addCriterion("E_DEVELOP_NO between", value1, value2, "eDevelopNo");
            return (Criteria) this;
        }

        public Criteria andEDevelopNoNotBetween(Long value1, Long value2) {
            addCriterion("E_DEVELOP_NO not between", value1, value2, "eDevelopNo");
            return (Criteria) this;
        }

        public Criteria andESexIsNull() {
            addCriterion("E_SEX is null");
            return (Criteria) this;
        }

        public Criteria andESexIsNotNull() {
            addCriterion("E_SEX is not null");
            return (Criteria) this;
        }

        public Criteria andESexEqualTo(String value) {
            addCriterion("E_SEX =", value, "eSex");
            return (Criteria) this;
        }

        public Criteria andESexNotEqualTo(String value) {
            addCriterion("E_SEX <>", value, "eSex");
            return (Criteria) this;
        }

        public Criteria andESexGreaterThan(String value) {
            addCriterion("E_SEX >", value, "eSex");
            return (Criteria) this;
        }

        public Criteria andESexGreaterThanOrEqualTo(String value) {
            addCriterion("E_SEX >=", value, "eSex");
            return (Criteria) this;
        }

        public Criteria andESexLessThan(String value) {
            addCriterion("E_SEX <", value, "eSex");
            return (Criteria) this;
        }

        public Criteria andESexLessThanOrEqualTo(String value) {
            addCriterion("E_SEX <=", value, "eSex");
            return (Criteria) this;
        }

        public Criteria andESexLike(String value) {
            addCriterion("E_SEX like", value, "eSex");
            return (Criteria) this;
        }

        public Criteria andESexNotLike(String value) {
            addCriterion("E_SEX not like", value, "eSex");
            return (Criteria) this;
        }

        public Criteria andESexIn(List<String> values) {
            addCriterion("E_SEX in", values, "eSex");
            return (Criteria) this;
        }

        public Criteria andESexNotIn(List<String> values) {
            addCriterion("E_SEX not in", values, "eSex");
            return (Criteria) this;
        }

        public Criteria andESexBetween(String value1, String value2) {
            addCriterion("E_SEX between", value1, value2, "eSex");
            return (Criteria) this;
        }

        public Criteria andESexNotBetween(String value1, String value2) {
            addCriterion("E_SEX not between", value1, value2, "eSex");
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