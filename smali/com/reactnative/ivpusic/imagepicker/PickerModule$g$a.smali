.class Lcom/reactnative/ivpusic/imagepicker/PickerModule$g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/bridge/Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/reactnative/ivpusic/imagepicker/PickerModule$g;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/reactnative/ivpusic/imagepicker/PickerModule$g;


# direct methods
.method constructor <init>(Lcom/reactnative/ivpusic/imagepicker/PickerModule$g;)V
    .locals 0

    iput-object p1, p0, Lcom/reactnative/ivpusic/imagepicker/PickerModule$g$a;->a:Lcom/reactnative/ivpusic/imagepicker/PickerModule$g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public varargs invoke([Ljava/lang/Object;)V
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    aget-object p1, p1, v0

    .line 3
    .line 4
    check-cast p1, Ljava/lang/String;

    .line 5
    .line 6
    :try_start_0
    iget-object v0, p0, Lcom/reactnative/ivpusic/imagepicker/PickerModule$g$a;->a:Lcom/reactnative/ivpusic/imagepicker/PickerModule$g;

    .line 7
    .line 8
    iget-object v0, v0, Lcom/reactnative/ivpusic/imagepicker/PickerModule$g;->o:Lcom/reactnative/ivpusic/imagepicker/PickerModule;

    .line 9
    .line 10
    invoke-static {v0, p1}, Lcom/reactnative/ivpusic/imagepicker/PickerModule;->access$600(Lcom/reactnative/ivpusic/imagepicker/PickerModule;Ljava/lang/String;)Landroid/graphics/Bitmap;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    new-instance v1, Ljava/io/File;

    .line 15
    .line 16
    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/io/File;->lastModified()J

    .line 20
    .line 21
    .line 22
    move-result-wide v1

    .line 23
    invoke-static {p1}, Lcom/reactnative/ivpusic/imagepicker/PickerModule;->access$700(Ljava/lang/String;)Ljava/lang/Long;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 28
    .line 29
    .line 30
    move-result-wide v3

    .line 31
    new-instance v5, Lcom/facebook/react/bridge/WritableNativeMap;

    .line 32
    .line 33
    invoke-direct {v5}, Lcom/facebook/react/bridge/WritableNativeMap;-><init>()V

    .line 34
    .line 35
    .line 36
    const-string v6, "width"

    .line 37
    .line 38
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 39
    .line 40
    .line 41
    move-result v7

    .line 42
    invoke-interface {v5, v6, v7}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    .line 43
    .line 44
    .line 45
    const-string v6, "height"

    .line 46
    .line 47
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    invoke-interface {v5, v6, v0}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    .line 52
    .line 53
    .line 54
    const-string v0, "mime"

    .line 55
    .line 56
    iget-object v6, p0, Lcom/reactnative/ivpusic/imagepicker/PickerModule$g$a;->a:Lcom/reactnative/ivpusic/imagepicker/PickerModule$g;

    .line 57
    .line 58
    iget-object v6, v6, Lcom/reactnative/ivpusic/imagepicker/PickerModule$g;->n:Ljava/lang/String;

    .line 59
    .line 60
    invoke-interface {v5, v0, v6}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    const-string v0, "size"

    .line 64
    .line 65
    new-instance v6, Ljava/io/File;

    .line 66
    .line 67
    invoke-direct {v6, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v6}, Ljava/io/File;->length()J

    .line 71
    .line 72
    .line 73
    move-result-wide v6

    .line 74
    long-to-int v6, v6

    .line 75
    invoke-interface {v5, v0, v6}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    .line 76
    .line 77
    .line 78
    const-string v0, "duration"

    .line 79
    .line 80
    long-to-int v3, v3

    .line 81
    invoke-interface {v5, v0, v3}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    .line 82
    .line 83
    .line 84
    const-string v0, "path"

    .line 85
    .line 86
    new-instance v3, Ljava/lang/StringBuilder;

    .line 87
    .line 88
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 89
    .line 90
    .line 91
    const-string v4, "file://"

    .line 92
    .line 93
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-interface {v5, v0, p1}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    const-string p1, "modificationDate"

    .line 107
    .line 108
    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-interface {v5, p1, v0}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    iget-object p1, p0, Lcom/reactnative/ivpusic/imagepicker/PickerModule$g$a;->a:Lcom/reactnative/ivpusic/imagepicker/PickerModule$g;

    .line 116
    .line 117
    iget-object p1, p1, Lcom/reactnative/ivpusic/imagepicker/PickerModule$g;->o:Lcom/reactnative/ivpusic/imagepicker/PickerModule;

    .line 118
    .line 119
    invoke-static {p1}, Lcom/reactnative/ivpusic/imagepicker/PickerModule;->access$800(Lcom/reactnative/ivpusic/imagepicker/PickerModule;)Lcom/reactnative/ivpusic/imagepicker/g;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    invoke-virtual {p1, v5}, Lcom/reactnative/ivpusic/imagepicker/g;->d(Lcom/facebook/react/bridge/WritableMap;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 124
    .line 125
    .line 126
    goto :goto_0

    .line 127
    :catch_0
    move-exception p1

    .line 128
    iget-object v0, p0, Lcom/reactnative/ivpusic/imagepicker/PickerModule$g$a;->a:Lcom/reactnative/ivpusic/imagepicker/PickerModule$g;

    .line 129
    .line 130
    iget-object v0, v0, Lcom/reactnative/ivpusic/imagepicker/PickerModule$g;->o:Lcom/reactnative/ivpusic/imagepicker/PickerModule;

    .line 131
    .line 132
    invoke-static {v0}, Lcom/reactnative/ivpusic/imagepicker/PickerModule;->access$800(Lcom/reactnative/ivpusic/imagepicker/PickerModule;)Lcom/reactnative/ivpusic/imagepicker/g;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    const-string v1, "E_NO_IMAGE_DATA_FOUND"

    .line 137
    .line 138
    invoke-virtual {v0, v1, p1}, Lcom/reactnative/ivpusic/imagepicker/g;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 139
    .line 140
    .line 141
    :goto_0
    return-void
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
.end method
