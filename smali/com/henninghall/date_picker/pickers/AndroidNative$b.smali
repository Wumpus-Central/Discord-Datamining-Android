.class Lcom/henninghall/date_picker/pickers/AndroidNative$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/henninghall/date_picker/pickers/AndroidNative;->m(ZIZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic k:Lcom/henninghall/date_picker/pickers/AndroidNative;

.field final synthetic l:Z

.field final synthetic m:Z

.field final synthetic n:Lcom/henninghall/date_picker/pickers/AndroidNative;


# direct methods
.method constructor <init>(Lcom/henninghall/date_picker/pickers/AndroidNative;Lcom/henninghall/date_picker/pickers/AndroidNative;ZZ)V
    .locals 0

    iput-object p1, p0, Lcom/henninghall/date_picker/pickers/AndroidNative$b;->n:Lcom/henninghall/date_picker/pickers/AndroidNative;

    iput-object p2, p0, Lcom/henninghall/date_picker/pickers/AndroidNative$b;->k:Lcom/henninghall/date_picker/pickers/AndroidNative;

    iput-boolean p3, p0, Lcom/henninghall/date_picker/pickers/AndroidNative$b;->l:Z

    iput-boolean p4, p0, Lcom/henninghall/date_picker/pickers/AndroidNative$b;->m:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/henninghall/date_picker/pickers/AndroidNative$b;->n:Lcom/henninghall/date_picker/pickers/AndroidNative;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/henninghall/date_picker/pickers/AndroidNative$b;->k:Lcom/henninghall/date_picker/pickers/AndroidNative;

    .line 4
    .line 5
    iget-boolean v2, p0, Lcom/henninghall/date_picker/pickers/AndroidNative$b;->l:Z

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Lcom/henninghall/date_picker/pickers/AndroidNative;->e(Lcom/henninghall/date_picker/pickers/AndroidNative;Landroid/widget/NumberPicker;Z)V

    .line 8
    .line 9
    .line 10
    iget-boolean v0, p0, Lcom/henninghall/date_picker/pickers/AndroidNative$b;->m:Z

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lcom/henninghall/date_picker/pickers/AndroidNative$b;->n:Lcom/henninghall/date_picker/pickers/AndroidNative;

    .line 15
    .line 16
    invoke-static {v0}, Lcom/henninghall/date_picker/pickers/AndroidNative;->f(Lcom/henninghall/date_picker/pickers/AndroidNative;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method
