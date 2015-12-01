package com.yk.mac.myapplication;

import com.litesuits.orm.db.annotation.Column;
import com.litesuits.orm.db.annotation.PrimaryKey;
import com.litesuits.orm.db.annotation.Table;

/**
 * Package Name: com.lianaibiji.dev.persistence.type
 * Version     : 1.0
 * Author      : dingpeng
 * Company     :
 * Date        : 15/9/1
 * Time        : 下午2:39
 * Info:
 * Copyright: CopyRight © 2015 dingpeng,All Rights Reserved
 */
@Table("indexcache")
public class IndexCacheType {

    public static final int OPERATION_DELETE = 4;
    public static final String CHUNK_CONTENT_ID = "chunk_content_id";
    public static final String USER_ID = "user_id";



    @PrimaryKey(PrimaryKey.AssignType.AUTO_INCREMENT)
    @Column("_id")
    protected long data_id;


    @Column(USER_ID)
    int user_id;

    int chunk_type;

    int chunk_content_status;
    int chunk_content_emotion;


    String chunk_content_resource;

    long chunk_content_last_update_timestamp;
    int chunk_content_resource_id;
    int chunk_content_via_platform_type;
    int chunk_content_owner_lover_id;
    long chunk_content_create_timestamp;
    int chunk_content_owner_user_id;
    int chunk_content_update_count;
    long chunk_content_event_happen_datetime;
    int chunk_content_comments_count;
    int chunk_content_type;


    int chunk_content_extra_emotion;

    @Column(CHUNK_CONTENT_ID)
    int chunk_content_id;

    int chunk_content_resource_type;
    String chunk_content_date;

    int operation;

    public int getChunk_type() {
        return chunk_type;
    }

    public void setChunk_type(int chunk_type) {
        this.chunk_type = chunk_type;
    }

    public int getChunk_content_status() {
        return chunk_content_status;
    }

    public void setChunk_content_status(int chunk_content_status) {
        this.chunk_content_status = chunk_content_status;
    }

    public int getChunk_content_emotion() {
        return chunk_content_emotion;
    }

    public void setChunk_content_emotion(int chunk_content_emotion) {
        this.chunk_content_emotion = chunk_content_emotion;
    }

    public String getChunk_content_resource() {
        return chunk_content_resource;
    }

    public void setChunk_content_resource(String chunk_content_resource) {
        this.chunk_content_resource = chunk_content_resource;
    }

    public long getChunk_content_last_update_timestamp() {
        return chunk_content_last_update_timestamp;
    }

    public void setChunk_content_last_update_timestamp(long chunk_content_last_update_timestamp) {
        this.chunk_content_last_update_timestamp = chunk_content_last_update_timestamp;
    }

    public int getChunk_content_resource_id() {
        return chunk_content_resource_id;
    }

    public void setChunk_content_resource_id(int chunk_content_resource_id) {
        this.chunk_content_resource_id = chunk_content_resource_id;
    }

    public int getChunk_content_via_platform_type() {
        return chunk_content_via_platform_type;
    }

    public void setChunk_content_via_platform_type(int chunk_content_via_platform_type) {
        this.chunk_content_via_platform_type = chunk_content_via_platform_type;
    }

    public int getChunk_content_owner_lover_id() {
        return chunk_content_owner_lover_id;
    }

    public void setChunk_content_owner_lover_id(int chunk_content_owner_lover_id) {
        this.chunk_content_owner_lover_id = chunk_content_owner_lover_id;
    }

    public long getChunk_content_create_timestamp() {
        return chunk_content_create_timestamp;
    }

    public void setChunk_content_create_timestamp(long chunk_content_create_timestamp) {
        this.chunk_content_create_timestamp = chunk_content_create_timestamp;
    }

    public int getChunk_content_owner_user_id() {
        return chunk_content_owner_user_id;
    }

    public void setChunk_content_owner_user_id(int chunk_content_owner_user_id) {
        this.chunk_content_owner_user_id = chunk_content_owner_user_id;
    }

    public long getChunk_content_event_happen_datetime() {
        return chunk_content_event_happen_datetime;
    }

    public void setChunk_content_event_happen_datetime(long chunk_content_event_happen_datetime) {
        this.chunk_content_event_happen_datetime = chunk_content_event_happen_datetime;
    }

    public int getChunk_content_comments_count() {
        return chunk_content_comments_count;
    }

    public void setChunk_content_comments_count(int chunk_content_comments_count) {
        this.chunk_content_comments_count = chunk_content_comments_count;
    }

    public int getChunk_content_type() {
        return chunk_content_type;
    }

    public void setChunk_content_type(int chunk_content_type) {
        this.chunk_content_type = chunk_content_type;
    }

    public int getChunk_content_id() {
        return chunk_content_id;
    }

    public void setChunk_content_id(int chunk_content_id) {
        this.chunk_content_id = chunk_content_id;
    }

    public int getChunk_content_resource_type() {
        return chunk_content_resource_type;
    }

    public void setChunk_content_resource_type(int chunk_content_resource_type) {
        this.chunk_content_resource_type = chunk_content_resource_type;
    }

    public long getData_id() {
        return data_id;
    }

    public void setData_id(long data_id) {
        this.data_id = data_id;
    }

    public int getChunk_content_update_count() {
        return chunk_content_update_count;
    }

    public void setChunk_content_update_count(int chunk_content_update_count) {
        this.chunk_content_update_count = chunk_content_update_count;
    }

    public int getOperation() {
        return operation;
    }

    public void setOperation(int operation) {
        this.operation = operation;
    }

    public String getChunk_content_date() {
        return chunk_content_date;
    }

    public void setChunk_content_date(String chunk_content_date) {
        this.chunk_content_date = chunk_content_date;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getChunk_content_extra_emotion() {
        return chunk_content_extra_emotion;
    }

    public void setChunk_content_extra_emotion(int chunk_content_extra_emotion) {
        this.chunk_content_extra_emotion = chunk_content_extra_emotion;
    }






}
